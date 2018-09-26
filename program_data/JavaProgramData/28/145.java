package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int flag = 0;
		int flagdh = 0;
		String a = new String(new char[1000]);
		int counts = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i + 1) != '\0')
			{
				if (flag == 0 && a.charAt(i) != ' ')
				{
					flag = 1;
					counts++;
				}
				else if (flag == 1 && a.charAt(i) != ' ')
				{
					counts++;
				}
				else if (flag == 1 && a.charAt(i) == ' ')
				{
					flag = 0;
					if (flagdh == 0)
					{
						flagdh = 1;
						System.out.printf("%d",counts);
					}
					else
					{
						System.out.printf(",%d",counts);
					}
					counts = 0;
				}
			}
			else
			{
				if (flag == 1)
				{
					if (a.charAt(i) != ' ')
					{
						counts++;
						if (flagdh == 0)
						{
							System.out.printf("%d",counts);
						}
						else
						{
							System.out.printf(",%d",counts);
						}
					}
					else
					{
						if (flagdh == 0)
						{
							System.out.printf("%d",counts);
						}
						else
						{
							System.out.printf(",%d",counts);
						}
					}
				}
				else
				{
					if (a.charAt(i) != ' ')
					{
						if (flagdh == 0)
						{
							System.out.print("1");
						}
						else
						{
							System.out.print(",1");
						}
					}
				}
			}
		}
	}


}
