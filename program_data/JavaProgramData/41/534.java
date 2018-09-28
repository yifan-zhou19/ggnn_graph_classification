public class chang
{
	public int caice;
	public int minci;
}

package <missing>;

public class GlobalMembers
{
	public static void swap(chang p1, chang p2)
	{
		chang temp = new chang();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*p1;
		temp.copyFrom(p1);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p1=*p2;
		p1.copyFrom(p2);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p2=temp;
		p2.copyFrom(temp);
	}
	public static int Main()
	{
		chang[] c = tangible.Arrays.initializeWithDefaultchangInstances(6);
		int i;
		int j;
		int k;
		int l;
		int m;
		int t;
		for (i = 1;i < 6;i++)
		{
			c[i].minci = i;
		}
		for (j = 1;j <= 5;j++)
		{
			for (k = 1;k <= 4;k++)
			{
				for (l = 1;l <= 3;l++)
				{
					for (m = 1;m <= 2;m++)
					{
						t = 0;
						if (c[5].minci != 2 && c[5].minci != 3)
						{
							for (i = 1;i < 6;i++)
							{
								c[i].caice = 0;
							}
							if (c[5].minci == 1)
							{
							c[1].caice = 1;
							}
							if (c[2].minci == 2)
							{
							c[2].caice = 1;
							}
							if (c[1].minci == 5)
							{
							c[3].caice = 1;
							}
							if (c[3].minci != 1)
							{
							c[4].caice = 1;
							}
							if (c[4].minci == 1)
							{
							c[5].caice = 1;
							}
							for (i = 1;i < 6;i++)
							{
								if ((c[i].minci > 2 && c[i].caice == 1) || (c[i].minci <= 2 && c[i].caice == 0))
								{
									t++;
									break;
								}
							}
							if (t == 0)
							{
								for (i = 1;i < 5;i++)
								{
									System.out.printf("%d ",c[i].minci);
								}
								System.out.printf("%d",c[i].minci);
							}
						}
						if (m < 2)
						{
						swap(c + 4, c + 4 + m);
						}
						else
						{
						swap(c + 4, c + 5);
						}
					}
					if (l < 3)
					{
					swap(c + 3, c + 3 + l);
					}
					else
					{
					swap(c + 3, c + 4);
					swap(c + 4, c + 5);
					}
				}
				if (k < 4)
				{
				swap(c + 2, c + 2 + k);
				}
				else
				{
					swap(c + 2, c + 3);
					swap(c + 3, c + 4);
					swap(c + 4, c + 5);
				}
			}
			if (j < 5)
			{
			swap(c + 1, c + 1 + j);
			}
		}
	}







}

