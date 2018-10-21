package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		int t = 0;
		double[] num = new double[300];
		double averg = 0;
		double maxd = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			averg += num[i];
		}
		averg /= n;
	 // cout<<averg;
		for (i = 0 ; i < n ; i++)
		{
		 if (Math.abs(num[i] - averg) > maxd)
		 {
			 maxd = Math.abs(num[i] - averg);
		 }
		}
	// cout<<maxd;  
		for (i = 0 ; i < n ; i++)
		{
		 if (Math.abs(Math.abs(num[i] - averg) - maxd) < 0.000001)
		 {
			 c++;
		 }
		}

		for (i = 0 ; i < n ; i++)
		{
		 if (averg - num[i] > 0 && Math.abs((averg - num[i]) - maxd) < 0.000001)
		 {
		  if (t < c - 1)
		  {
		  System.out.print(num[i]);
		  System.out.print(",");
		  t++;
		  }
		   else
		   {
			   System.out.print(num[i]);
		   }
		 }
		}

		 for (i = 0 ; i < n ; i++)
		 {
		 if (num[i] - averg > 0 && Math.abs((num[i] - averg) - maxd) < 0.000001)
		 {
		  if (t < c - 1)
		  {
		  System.out.print(num[i]);
		  System.out.print(",");
		  t++;
		  }
		   else
		   {
			   System.out.print(num[i]);
		   }
		 }
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