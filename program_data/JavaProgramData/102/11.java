package <missing>;

public class GlobalMembers
{
	public static void arrange(float[] arrangearry, int nt, int kd_order)
	{
		int flagi;
		int flagj;
		float temporary;
		if (kd_order == 1)
		{
			for (flagi = nt - 1;flagi > 0;flagi--)
			{
				for (flagj = 0;flagj < flagi;flagj++)
				{
					if (arrangearry[flagj] < arrangearry[flagj + 1])
					{
						temporary = arrangearry[flagj];
						arrangearry[flagj] = arrangearry[flagj + 1];
						arrangearry[flagj + 1] = temporary;
					}
				}
			}
		}
		else
		{
			for (flagi = nt - 1;flagi > 0;flagi--)
			{
				for (flagj = 0;flagj < flagi;flagj++)
				{
					if (arrangearry[flagj] > arrangearry[flagj + 1])
					{
						temporary = arrangearry[flagj];
						arrangearry[flagj] = arrangearry[flagj + 1];
						arrangearry[flagj + 1] = temporary;
					}
				}
			}
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int len;
		int male = 0;
		int female = 0;
		float[] a = new float[40];
		float[] b = new float[40];
		float height;
		String sex = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sex = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height = Float.parseFloat(tempVar2);
			}
			len = sex.length();
			if (len == 4)
			{
				a[male] = height;
				male++;
			}
			if (len == 6)
			{
				b[female] = height;
				female++;
			}
		}
		arrange(a, male, 0);
		arrange(b, female, 1);
		System.out.printf("%.2f",a[0]);
		for (i = 1;i < male;i++)
		{
			System.out.printf(" %.2f",a[i]);
		}
		for (i = 0;i < female;i++)
		{
			System.out.printf(" %.2f",b[i]);
		}
		return 0;
	}
}

