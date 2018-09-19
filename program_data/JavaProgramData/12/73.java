package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] s = new float[16];
		float[] t = new float[16];
		int u = 0;
		int g = 0;
		for (int k = 1;k < 100;k++)
		{
			int a = 0;
			for (int i = 0;i < 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i] = Float.parseFloat(tempVar);
				}
				if (s[0] == -1F || scanf(""))
				{
					System.out.print("");
				}
				else
				{
					u += 1;
					if (s[i] == 0F)
					{
						break;
					}
					else
					{
						t[i] = s[i];
						a++;
					}
				}
			}
				int b = 0;
				for (int h = 0;h < a;h++)
				{
					for (int k = 0;k < a;k++)
					{
						if (t[h] / t[k] == 2F)
						{
							b++;
						}
					}
				}
				System.out.printf("%d\n",b);
				g++;
				if (g == u)
				{
				System.out.print("");
				}
		}

		return 0;
	}
}

