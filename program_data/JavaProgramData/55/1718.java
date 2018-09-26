package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int ans = 0;
		char[] x = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a == b)
		{
			System.out.printf("%s\n",x);
		}
		//printf("%d %s %d\n",a,x,b);
		else
		{
			int flag = 1;
			for (int i = x.length() - 1;i >= 0;i--)
			{
				int temp;
				if (x[i] >= '0' && x[i] <= '9')
				{
					temp = x[i] - '0';
				}
				if (x[i] >= 'A' && x[i] <= 'Z')
				{
					temp = x[i] - 'A' + 10;
				}
				if (x[i] >= 'a' && x[i] <= 'z')
				{
					temp = x[i] - 'a' + 10;
				}
				ans += temp * flag;
			//	printf("%lld\n",ans);
				flag *= a;
			}
			if (ans == 0)
			{
				System.out.print("0\n");
			}
			else
			{
			//	printf("%lld\n",ans);
				int[] final = new int[100];
				flag = 0;
				while (ans > 0)
				{
					flag++;
					final[flag] = ans % b;
					ans /= b;
				}
				for (int i = flag;i >= 1;i--)
				{
					if (final[i] >= 10)
					{
						System.out.printf("%c",final[i] - 10 + 'A');
					}
					else
					{
						System.out.printf("%ld",final[i]);
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

