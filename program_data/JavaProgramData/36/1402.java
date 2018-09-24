package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int number1 = a.length();
		int number2 = b.length();
		if (number1 != number2)
		{
		System.out.print("NO");
		}
		else
		{
			String record1 = new String(new char[100]);
			String record2 = new String(new char[100]);
			int[] num1 = new int[100];
			int[] num2 = new int[100];
			int i;
			int k = 0;
			int m = 0;
			int j;
			record1 = tangible.StringFunctions.changeCharacter(record1, k, a.charAt(0));
			record2 = tangible.StringFunctions.changeCharacter(record2, m, b.charAt(0));
			num1[k] = 1;
			num2[m] = 1;
			for (i = 1;i < number1;i++)
			{
				for (j = 0;j <= k;j++)
				{
					if (a.charAt(i) == record1.charAt(k))
					{
							num1[k]++;
						break;
					}
					else
					{
						k++;
						record1 = tangible.StringFunctions.changeCharacter(record1, k, a.charAt(i));
						num1[k]++;
						break;
					}
				}
				  for (j = 0;j <= m;j++)
				  {
					if (b.charAt(i) == record2.charAt(m))
					{
							num2[m]++;
						break;
					}
					else
					{
						m++;
						record2 = tangible.StringFunctions.changeCharacter(record2, m, b.charAt(i));
						num2[m]++;
						break;
					}
				  }
			}
			if (k != m)
			{
			System.out.print("NO");
			}
			else
			{
				int sum = 0;
				for (i = 0;i <= k;i++)
				{
					for (j = 0;j <= k;j++)
					{
						if (record1.charAt(i) == record2.charAt(j) && num1[i] == num2[j])
						{
							sum++;
							record2 = tangible.StringFunctions.changeCharacter(record2, j, ' ');
							num2[j] = 0;
							break;
						}
					}
				}
				if (sum == k + 1)
				{
				System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
			}
		}
		return 0;
	}

}

