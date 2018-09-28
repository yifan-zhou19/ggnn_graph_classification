package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char a;
		final String num = "";
		int[] v = new int[500];
		int i;
		int p;
		int l;
		int s = 0;
		int j = 0;
		int k = 0;
		int sign = 0;
		int max;
		int max2;
		 for (i = 0;;i++)
		 {
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			if (a != '\n' && a != ',')
			{
				num.charAt(j)[k] = a;
				k++;
			}
			else if (a == ',')
			{
				j++;
				k = 0;
				s++;
			}
			else
			{
				break;
			}
		 }
		for (i = 0;i <= 499;i++)
		{
			l = String.valueOf(num.charAt(i)).length();
			for (j = 1,p = 1;j <= l;j++)
			{
				v[i] = v[i] + (num.charAt(i)[l - j] - '0') * p;
				p = p * 10;
			}
		}
		for (i = 0;i <= s;i++)
		{
			if (v[i] > max)
			{
				max = v[i];
			}
		}
		for (i = 0;i <= s;i++)
		{
			if (v[i] > max2 && v[i] < max)
			{
				max2 = v[i];
				sign = 1;
			}
		}
		if (sign != 0)
		{
			System.out.printf("%d",max2);
		}
			else
			{
				System.out.print("No");
			}

	}

}

