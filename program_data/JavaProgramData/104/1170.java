package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
					int x;
					int y;
					int c;
					int d;
					int e;
					int i;
					int j;
					int[] a = new int[20];
					int[] b = new int[20];
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[0] = Integer.parseInt(tempVar);
					}
					String tempVar2 = ConsoleInput.scanfRead(" ");
					if (tempVar2 != null)
					{
						b[0] = Integer.parseInt(tempVar2);
					}

					for (i = 1;i < 20;i++)
					{
						a[i] = a[i - 1] / 2;
					if (a[i] == 1)
					{
					break;
					}
					}
						 for (i = 1;i < 20;i++)
						 {
						b[i] = b[i - 1] / 2;
					if (a[i] == 1)
					{
					break;
					}
						 }
					e = 0;

					for (i = 0;i < 20;i++)
					{
									 for (j = 0;j < 20;j++)
									 {
													  if (b[j] == a[i])
													  {
														  e = b[j];
													  break;
													  }
									 }
													  if (e != 0)
													  {
													  break;
													  }
					}
				  System.out.printf("%d",e);
								System.in.read();
								System.in.read();
								System.in.read();
								System.in.read();
	}

}

