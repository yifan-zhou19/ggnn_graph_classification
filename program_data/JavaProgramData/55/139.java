package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int length;
		int original;
		int then;
		int[] change = new int[100];
		int i;
		int j;
		int k;
		int s = 0;
		int m;
		int length2;
		String input = new String(new char[100]);
		String output = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			original = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			input = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			then = Integer.parseInt(tempVar3);
		}
		length = input.length();
		for (i = 0;i < length;i++)
		{
			if (input.charAt(i) <= '9')
			{
				change[i] = input.charAt(i) - 48;
			}
			else if (input.charAt(i) >= 'a')
			{
				change[i] = input.charAt(i) - 87;
			}
			else
			{
				change[i] = input.charAt(i) - 55;
			}
		}
		for (i = 0;i < length;i++)
		{
			s = s + Math.pow(original,length - i - 1) * change[i];
		}
		for (j = 0;;j++)
		{
			m = s % then;
			s = s / then;
			{
				if (s == 0)
				{
					if ((m <= 9) && (m >= 0))
					{
						output = tangible.StringFunctions.changeCharacter(output, j, m + 48);
						break;
					}
					else if ((m > 9) && (m <= 35))
					{
						output = tangible.StringFunctions.changeCharacter(output, j, m + 55);
						break;
					}
				}
				else
				{
					if ((m <= 9) && (m >= 0))
					{
						output = tangible.StringFunctions.changeCharacter(output, j, m + 48);
					}
					 else if ((m > 9) && (m <= 35))
					 {
						 output = tangible.StringFunctions.changeCharacter(output, j, m + 55);
					 }
				}
			}
		}
		for (k = 0;k < j + 1;k++)
		{
			System.out.printf("%c",output.charAt(j - k));
		}
		System.out.print("\n");
	}
}

