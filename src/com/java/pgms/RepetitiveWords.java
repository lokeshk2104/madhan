package com.java.pgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepetitiveWords {

	public static void main(String[] args) {

		String s = "Welcome to to my to my to world";
		String[] splt = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String str : splt) {
			if (m.containsKey(str)) {
				Integer in = m.get(str);
				m.put(str, in + 1);

			}

			else

			{
				m.put(str, 1);
				
			}
		}

			System.out.println(m);

		}

	}


