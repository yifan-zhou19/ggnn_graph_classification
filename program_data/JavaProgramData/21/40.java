package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int c;
		int n;
		int max;
		int min;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		max = a[0];
		min = a[0];
		sum = a[0];
		if (n > 1)
		{
			for (c = 1;c < n;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[c] = Integer.parseInt(tempVar3);
				}
			}
			for (c = 1;c < n;c++)
			{
				sum = sum + a[c];
				if (max < a[c])
				{
					max = a[c];
				}
				if (min > a[c])
				{
					min = a[c];
				}
			}
			if (max * n - sum > sum - min * n)
			{
				System.out.printf("%d\n",max);
			}
			else
			{
				if (max * n - sum < sum - min * n)
				{
					System.out.printf("%d\n",min);
				}
				else
				{
					System.out.printf("%d,%d\n",min,max);
				}
			}
		}
		else
		{
			null;
		}
	}
}

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2018 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to convert basic C++ 'cin' behavior.
//----------------------------------------------------------------------------------------
public final class ConsoleInput
{
	private static boolean goodLastRead = false;
	public static boolean lastReadWasGood()
	{
		return goodLastRead;
	}

	public static String readToWhiteSpace(boolean skipLeadingWhiteSpace)
	{
		String input = "";
		char nextChar;
		while (Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			//accumulate leading white space if skipLeadingWhiteSpace is false:
			if (!skipLeadingWhiteSpace)
			{
				input += nextChar;
			}
		}
		//the first non white space character:
		input += nextChar;

		//accumulate characters until white space is reached:
		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
		}

		goodLastRead = input.length() > 0;
		return input;
	}

	public static String scanfRead()
	{
		return scanfRead(null, -1);
	}

	public static String scanfRead(String unwantedSequence)
	{
		return scanfRead(unwantedSequence, -1);
	}

	public static String scanfRead(String unwantedSequence, int maxFieldLength)
	{
		String input = "";

		char nextChar;
		if (unwantedSequence != null)
		{
			nextChar = '\0';
			for (int charIndex = 0; charIndex < unwantedSequence.length(); charIndex++)
			{
				if (Character.isWhitespace(unwantedSequence.charAt(charIndex)))
				{
					//ignore all subsequent white space:
					while (Character.isWhitespace(nextChar = (char)System.in.read()))
					{
					}
				}
				else
				{
					//ensure each character matches the expected character in the sequence:
					nextChar = (char)System.in.read();
					if (nextChar != unwantedSequence.charAt(charIndex))
						return null;
				}
			}

			input = (new Character(nextChar)).toString();
			if (maxFieldLength == 1)
				return input;
		}

		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
			if (maxFieldLength == input.length())
				return input;
		}

		return input;
	}
}