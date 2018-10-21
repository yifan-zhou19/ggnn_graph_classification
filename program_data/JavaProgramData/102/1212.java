package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] sex = new char[100][30];
		double[] high = new double[100];
		for (int i = 1; i <= n; ++i)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			high[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1; i <= n; ++i)
		{
			for (int t = 1; t <= n; ++t)
			{
				double s;
				String c = new String(new char[30]);
				if (high[t] > high[i])
				{
					s = high[t];
					high[t] = high[i];
					high[i] = s;
					c = sex[i];
					sex[i] = sex[t];
					sex[t] = c;
				}
			}
		}
		//for(int i = 1; i <= n; ++i) cout<<high[i]<<sex[i]<<endl;
		int step = 0;
		for (int i = 1; i <= n; ++i)
		{
			if (strcmp(sex[i],"female") == 0)
			{
				continue;
			}
			if (step != (n - 1))
			{
				System.out.printf("%.2f ",high[i]);
				step = step + 1;
				//cout<<step<<endl;
			}
			else
			{
				System.out.printf("%.2f",high[i]);
			}
			//cout<<step<<endl;
		}

		for (int i = n; i >= 1; --i)
		{
			if (strcmp(sex[i],"male") == 0)
			{
				continue;
			}
			if (step != (n - 1))
			{
				System.out.printf("%.2f ",high[i]);
				step = step + 1;
				//cout<<step<<endl;
			}
			else
			{
				System.out.printf("%.2f",high[i]);
			}
			//if(step == n) break;
			//cout<<step<<endl;
		}
		//while(1);
		return 0;
	}
}

