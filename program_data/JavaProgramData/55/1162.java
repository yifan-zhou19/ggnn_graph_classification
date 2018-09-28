package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int k = 0;
		String c1 = new String(new char[100]);
		int[] d1 = new int[100];
		int[] d2 = new int[100];
		int[] c2 = new int[100];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = c1.length();
		int i;
		for (i = 0;i <= k - 1;i++)
		{
			if (48 <= c1.charAt(i) && c1.charAt(i) <= 57)
			{
			   d1[i] = c1.charAt(i) - 48;
			}
			else if (65 <= c1.charAt(i) && c1.charAt(i) <= 90)
			{
			   d1[i] = c1.charAt(i) - 55;
			}
			else
			{
				d1[i] = c1.charAt(i) - 87;
			}
		}
		int s = 0;
		int fc = 1;
		for (i = k - 1;i >= 0;i--)
		{
			s = s + fc * d1[i];
			fc = fc * a;
		}
		i = 0;
	if (s == 0)
	{
		  System.out.print(0);
		  System.out.print("\n");
	}
		while (s > 0)
		{
			d2[i] = s % b;
			s = s / b;
			i++;
		}


		int g;
		for (g = 0;g <= i - 1;g++)
		{
		   if (d2[g] <= 9)
		   {
			  c2[g] = d2[g] + 48;
		   }
			else
			{
				c2[g] = d2[g] + 55;
			}
		}
		for (g = i - 1;g >= 0;g--)
		{
		System.out.print((char)c2[g]);
		}
		return 0;


	}

}

