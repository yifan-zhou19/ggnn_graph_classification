package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					if ((A + (B > A) + (A == C) == 3) && (B + (A > B) + (A > C) == 3) && (C + (C > B) + (B > A) == 3) && ((A - B) * (B - C) * (C - A) != 0))
					{
						if (A > B)
						{
							if (B > C)
							{
								System.out.print("CBA");
								System.out.print("\n");
							}
											else
											{
												if (A > C)
												{
													System.out.print("BCA");
													System.out.print("\n");
												}
											else
											{
												System.out.print("BAC");
												System.out.print("\n");
											}
											}
						}
											else
											{
												if (A > C)
												{
													System.out.print("CAB");
													System.out.print("\n");
												}
											else
											{
												if (B > C)
												{
													System.out.print("ACB");
													System.out.print("\n");
												}
											else
											{
												System.out.print("ABC");
												System.out.print("\n");
											}
											}
											}

					}
				}
			}
		}
		return 0;
	}

}
