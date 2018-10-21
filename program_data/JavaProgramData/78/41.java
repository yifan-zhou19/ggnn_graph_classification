package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int mz = 0;
		int mq = 0;
		int ms = 0;
		int ml = 0;
		for (mz = 1 ; mz <= 5 ; mz++)
		{
			for (mq = 1 ; mq <= 5 ; mq++)
			{
				for (ms = 1 ; ms <= 5 ; ms++)
				{
					for (ml = 1 ; ml <= 5 ; ml++)
					{
						if ((mz + mq == ms + ml) && (ms + mz < mq) && (mz + ml> ms + mq))
						{
							for (int i = 5 ; i >= 1 ; i--)
							{
								if (mz == i)
								{
									System.out.print("z ");
									System.out.print(mz * 10);
									System.out.print("\n");
								}
								if (mq == i)
								{
									System.out.print("q ");
									System.out.print(mq * 10);
									System.out.print("\n");
								}
								if (ms == i)
								{
									System.out.print("s ");
									System.out.print(ms * 10);
									System.out.print("\n");
								}
								if (ml == i)
								{
									System.out.print("l ");
									System.out.print(ml * 10);
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
