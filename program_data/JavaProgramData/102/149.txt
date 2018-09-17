package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] fe = new int[40];
		int[] ma = new int[40];
		float f;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		String b = new String(new char[10]);
		int fec = 0;
		int mac = 0;
		for (i = 0;i < n;i++)
		{
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(b,"male") == 0)
			{
			//		scanf("%f",&f);
				f = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				ma[mac] = (int)(f * 1000);
				mac++;
			}
			if (strcmp(b,"female") == 0)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					f = Float.parseFloat(tempVar);
				}
				//cin>>f;
				fe[fec] = (int)(f * 1000);
				fec++;
			}
		}
		sort(ma,ma + mac);
		sort(fe,fe + fec);
		for (i = 0;i < mac;i++)
		{

			if (ma[i] % 10 >= 4)
			{
				ma[i]++;
			}
			//cout<<ma[i]/100.0<<" ";
			System.out.printf("%.2f ",ma[i] / 1000.0);
		}
		for (i = fec - 1;i >= 0;i--)
		{

			if (fe[i] % 10 >= 4)
			{
				fe[i]++;
			}
		//	cout<<fe[i]/100.0<<" ";
			if (i > 0)
			{
				System.out.printf("%.2f ",fe[i] / 1000.0);
			}
			if (i == 0)
			{
				System.out.printf("%.2f",fe[i] / 1000.0);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

