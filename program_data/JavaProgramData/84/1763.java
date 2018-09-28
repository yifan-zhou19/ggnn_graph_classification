package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int f;
		int s;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				f = num;
				s = num;
			}
			if (i == 1)
			{
				if (num > f)
				{
					s = f;
					f = num;

				}
				else
				{
					f = f;
					s = num;
				}
			}
			for (i = 1;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num = Integer.parseInt(tempVar3);
				}

				{
					if (num > f)
					{
						s = f;
						f = num;

					}
					else
					{
						if (num == f)
						{
							f = f;
							s = s;
						}
						else
						{
							if (num > s)
							{
								s = num;
								f = f;
							}
							else
							{
								s = s;
								f = f;
							}

						}
					}

			}
			}
		}
		System.out.printf("%d\n",f);
		System.out.printf("%d",s);
	}


}

