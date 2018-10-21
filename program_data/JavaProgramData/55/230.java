package <missing>;

public class GlobalMembers
{
	public static int b;
	public static void Main()
	{
		void PF(int k);
		int a;
		String n = new String(new char[10]);
		int i;
		int len;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		len = n.length();
		int sum = 0;
		for (i = 0;i < len;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				sum = sum * a + n.charAt(i) - '0';
			}
			else
			{
						if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
						{
						sum = sum * a + n.charAt(i) - 'a' + 10;
						}
					else
					{
						 sum = sum * a + n.charAt(i) - 'A' + 10;
					}
			}
		}
		PF(sum);
	}

		public static void PF(int k)
		{
			if (k < b)
			{
				if (k >= 0 && k <= 9)
				{
					System.out.printf("%c",k + '0');
				}
				else
				{
					System.out.printf("%c",k - 10 + 'A');
				}
			}
			else
			{
				PF(k / b);
					if (k % b >= 0 && k % b <= 9)
					{
					System.out.printf("%c",k % b + '0');
					}
				else
				{
					System.out.printf("%c",k % b - 10 + 'A');
				}
			}
		}












}

