package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int t = 0;
		float[] c = new float[10];
		float s = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = t + a[i];
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b[i] >= 60)
			{
				if (b[i] > 63)
				{
					if (b[i] > 67)
					{
						if (b[i] > 71)
						{
							if (b[i] > 74)
							{
								if (b[i] > 77)
								{
									if (b[i] > 81)
									{
										if (b[i] > 84)
										{
											if (b[i] > 89)
											{
												c[i] = 4.0F;
											}
											else
											{
												c[i] = 3.7F;
											}
										}
										else
										{
											c[i] = 3.3F;
										}
									}
									else
									{
										c[i] = 3.0F;
									}
								}
								else
								{
									c[i] = 2.7F;
								}
							}
							else
							{
								c[i] = 2.3F;
							}
						}
						else
						{
							c[i] = 2.0F;
						}
					}
					else
					{
						c[i] = 1.5F;
					}
				}
				else
				{
					c[i] = 1.0F;
				}
			}
			else
			{
				c[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = a[i] * c[i];
			s = s + c[i];
		}
		s = s / t;
		System.out.printf("%.2f", s);
		return 0;
	}
}

