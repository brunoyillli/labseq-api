package io.github.brunoyillli.labseqapi.service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import io.github.brunoyillli.labseqapi.exception.LabseqException;

@Service
public class LabseqService {

	private Map<Integer, BigInteger> cache = new HashMap<>();

	public BigInteger getLabseqValue(Integer index) {
		if (index < 0) {
			throw new LabseqException("The index value must be a non-negative integer");
		}

		if (index == 0 || index == 2) {
			return BigInteger.ZERO;
		}

		if (index == 1 || index == 3) {
			return BigInteger.ONE;
		}

		if (cache.containsKey(index)) {
			return cache.get(index);
		}

		BigInteger value = getLabseqValue(index - 4).add(getLabseqValue(index - 3));
		cache.put(index, value);

		return value;
	}
}