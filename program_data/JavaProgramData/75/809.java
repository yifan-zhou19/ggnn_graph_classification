package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[5010]); //????
		String out = new String(new char[5010]); //????
		int num = 0; //???
		int[] x = new int[1500];
		int[] y = new int[1500];
		int[] time = new int[1000];
		for (int i = 0;i < 1000;i++)
		{
			x[i] = 0;
			y[i] = 0;
			time[i] = 0;
		}
		in = ConsoleInput.readToWhiteSpace(true).charAt(0);
		out = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lenin = in.length();
		int lenout = out.length();
		in = tangible.StringFunctions.changeCharacter(in, lenin, ',');
		out = tangible.StringFunctions.changeCharacter(out, lenout, ',');
		int p = lenin; //????
		//cout<<p<<endl;
		int q = lenout;
		//cout<<q<<endl;
		int i = 0; //????
		int k = 0;
		while (p >= 0)
		{
			if (in.charAt(p) == ',')
			{
				i = p - 1;
				{
					while (in.charAt(i) != ',' && i != -1)
					{
						x[k] = x[k] + (int)(in.charAt(i) - '0') * (int)(Math.pow(10.0,(double)(p - 1 - i)));
						i--;
					}
					p = i;
					k++;
				}
			}
		}
		k = 0;
		while (q >= 0)
		{
			if (out.charAt(q) == ',')
			{
				i = q - 1;
				{
					while (out.charAt(i) != ',' && i != -1)
					{
						y[k] = y[k] + (int)(out.charAt(i) - '0') * (int)(Math.pow(10.0,(double)(q - 1 - i)));
						i--;
					}
					q = i;
					k++;
				}
			}
		}
		num = k;
		System.out.print(num);
		System.out.print(" ");
		/*
		for(i=0;i<num;i++)
		{
		    cout<<x[i]<<" "<<y[i]<<endl;
		}
		*/
		//????????????
		int maxe = 0;
		for (i = 0;i < 1000;i++)
		{
			for (int j = 0;j < k;j++)
			{
				if (i >= x[j] != 0 && i < y[j])
				{
					time[i]++;
				}

			}
			if (maxe < time[i])
			{
				maxe = time[i];
			}

		}
		System.out.print(maxe);
		System.out.print("\n");
		return 0;

	}


}

