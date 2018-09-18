package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		float[] s = new float[15];
		float[] t = new float[15];
		 int a = 0;

		for (int i = 0;i < 15;i++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Float.parseFloat(tempVar);
			}
		if (s[i] == 0F)
		{
			break;
		}
		else
		{
			t[i] = s[i];
		a = a + 1;
		}

		}

	int b = 0;
		for (int h = 0;h < a;h++)
		{
			for (int k = 0;k < a;k++)
			{
				if (t[h] / t[k] == 2F)
				{

			b = b + 1;
				}
			}
		}
		System.out.printf("%d",b);

		return 0;
	}
}

