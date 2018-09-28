package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N = new String(new char[101]);
		int e = 1;
		int len;
		int i;
		int j;
		int[] n = new int[100];
		int[] shan = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = tempVar.charAt(0);
		}
		len = N.length();


		for (i = 0;i < len;i++)
		{
			n[i] = N.charAt(i) - '0';
		}
		if ((n[0] * 10 + n[1]) < 13)
		{
			e = 2;
		}
		for (i = 1;i < len;i++)
		{
			if ((n[i - 1] * 10 + n[i]) / 13 > 0)
			{
				shan[i] = (n[i - 1] * 10 + n[i]) / 13;
				n[i] = (n[i - 1] * 10 + n[i]) % 13;
			}
			else
			{
				for (j = 0;;j++)
				{
					if ((n[i - 1] * 10 + n[i]) / 13 == 0)
					{
						n[i] = n[i - 1] * 10 + n[i];
						shan[i] = 0;
						i++;
					}
					else
					{
						break;
					}
				}
					shan[i] = (n[i - 1] * 10 + n[i]) / 13;
					n[i] = (n[i - 1] * 10 + n[i]) % 13;
			}
		}
		for (i = e;i < len - 1;i++)
		{
			System.out.printf("%d",shan[i]);
		}
		System.out.printf("%d\n",shan[len - 1]);
		System.out.printf("%d",n[len - 1]);
		return 0;
	}

}

