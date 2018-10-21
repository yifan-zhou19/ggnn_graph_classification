package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float s;
		float k = 0F;
		float l = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		float[] c = new float[n];
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
						b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						if (b[i] >= 90 && b[i] <= 100)
						{
						c[i] = 4F;
						}
						else if (b[i] >= 85 && b[i] <= 89)
						{
						c[i] = 3.7F;
						}
						else if (b[i] >= 82 && b[i] <= 84)
						{
						c[i] = 3.3F;
						}
						else if (b[i] >= 78 && b[i] <= 81)
						{
						c[i] = 3.0F;
						}
						else if (b[i] >= 75 && b[i] <= 77)
						{
						c[i] = 2.7F;
						}
						else if (b[i] >= 72 && b[i] <= 74)
						{
						c[i] = 2.3F;
						}
						else if (b[i] >= 68 && b[i] <= 71)
						{
						c[i] = 2.0F;
						}
						else if (b[i] >= 64 && b[i] <= 67)
						{
						c[i] = 1.5F;
						}
						else if (b[i] >= 60 && b[i] <= 63)
						{
						c[i] = 1.0F;
						}
						else
						{
							c[i] = 0F;
						}
		}
						for (i = 0;i < n;i++)
						{
										k = k + a[i] * c[i];
										l = l + a[i];
						}
										s = (float)k / (float)l;
										System.out.printf("%.2f", s);
										System.out.printf("%.2f", "\n");
										return 0;
	}

}

