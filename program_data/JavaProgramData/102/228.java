package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] a = new float[40];
		float[] s1 = new float[40];
		float[] s2 = new float[40];
		float temp;
		int n;
		int i1 = 0;
		int i2 = 0;
		int i;
		int j;
		int temp1 = 0;
		int m;
		String b = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			if (b.charAt(0) == 'm')
			{
				s1[i1] = a[i];
				i1++;
			}
			if (b.charAt(0) == 'f')
			{
				s2[i2] = a[i];
				i2++;
			}
		}

		for (i = 0;i < i1 - 1;i++)
		{
			temp1 = i;
			temp = s1[i];
			for (j = i + 1;j < i1;j++)
			{
				if (temp > s1[j])
				{
					temp = s1[j];
					temp1 = j;
				}
			}
			s1[temp1] = s1[i];
			s1[i] = temp;
		}
		temp1 = 0;
		for (i = 0;i < i2 - 1;i++)
		{
			temp1 = i;
			temp = s2[i];
			for (j = i + 1;j < i2;j++)
			{
				if (temp > s2[j])
				{
					temp = s2[j];
					temp1 = j;
				}
			}
			s2[temp1] = s2[i];
			s2[i] = temp;
		}
		for (i = 0;i < i1;i++)
		{
			System.out.printf("%1.2f ",s1[i]);
		}
		for (i = i2 - 1;i > 0;i--)
		{
			System.out.printf("%1.2f ",s2[i]);
		}
		System.out.printf("%1.2f",s2[0]);
	}
}

