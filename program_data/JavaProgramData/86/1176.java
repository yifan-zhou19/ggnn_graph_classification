package <missing>;

public class GlobalMembers
{
	///#include <fstream>

	public static int n;
	public static int[] a = new int[61];
	public static int b;
	public static int[] q = new int[61];
	public static int Main()
	{
	   // ifstream cin("in.txt");
		int i;
		int j;
		int k;
		int t;
		int sum;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;++i)
		{
						t = 60;
						k = 0;
						c = 0;
						sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						memset(a,0,(Integer.SIZE / Byte.SIZE));
						b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						for (j = 0;j < b;++j)
						{
							a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							q[j] = a[j];
						}
						if (b == 0)
						{
							System.out.print(60);
							System.out.print("\n");
						}
						else
						{
							if (a[0] >= 60)
							{
										System.out.print(60);
										System.out.print("\n");
										continue;
							}
							for (j = 0;j < b;++j)
							{
											a[j] += j * 3;
											//cout<<a[j]<<endl;
							}
							for (j = 0;j < b;++j)
							{
											if (a[j] >= 60)
											{
													   sum = a[j - 1] - ((j - 1) * 3);
													   t -= a[j - 1];
													   c = 1;
													   break;
											}
							}
							if (c != 0)
							{
								 if (t > 3)
								 {
									 sum += t - 3;
								 }
							}
							else
							{
								sum = q[b - 1];
								t -= a[b - 1];
								if (t > 3)
								{
									sum += t - 3;
								}
							}
							System.out.print(sum);
							System.out.print("\n");
						}
							/*
							while(t>a[k])
							{
							             if(k==b) break;
							             t-=a[k];
							             k++;
							             sum+=a[k-1];
							             cout<<sum<<endl;
							             t-=3;
							             cout<<t<<endl;
							}
							if(k==b) sum+=t;
							else
							{
							    t-=3;
							    cout<<sum<<endl;
							    if(t>0) sum+=t;
							}
							cout<<sum<<endl;
							*/
		}
	 //   cin>>b;
		return 0;
	}

}

