package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		int n;
		int i;
		int max1;
		int max2;
		int min;
		int now;
		max1 = -1;
		max2 = -1;
		min = 65535;
		str = new Scanner(System.in).nextLine();
		str += ",";
		n = str.length();
		//printf("%d\n",n);
		now = 0;
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == ',')
			{
				//printf("%dEND\n",now);
				if (now > max1)
				{
					max2 = max1;
					max1 = now;
				}
				else
				{
					if (now > max2 && now < max1)
					{
						max2 = now;
					}
				}
				if (now < min)
				{
					min = now;
				}
				now = 0;
			}
			else
			{
				now = now * 10 + str.charAt(i) - 48;
			}
			//printf("%d\n",now);
		}
		if (max1 == min || max2 < 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",max2);
		}
		//scanf("%d",&n);
	}


}
