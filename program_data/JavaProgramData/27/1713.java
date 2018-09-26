package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int j;
		char i = 'i';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (j = 0;j < n;j++)
			{
				float a;
				float b;
				float c;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Float.parseFloat(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Float.parseFloat(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					c = Float.parseFloat(tempVar4);
				}
				double e;
				double f;
				double m;
				double n;
					if ((b * b - 4 * a * c) > 0)
					{
						e = ((-b) + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						f = ((-b) - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
						System.out.printf("x1=%.5f;x2=%.5f\n",e,f);
					}
					else if ((b * b - 4 * a * c) == 0)
					{
							  e = f = (-b) / (2 * a);
							  System.out.printf("x1=x2=%.5f\n",e);
					}

					else
					{
							m = (-b) / (2 * a);
							n = Math.sqrt(4 * a * c - b * b) / (2 * a);
							if (b == 0F)
							{
							   System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",n,n);
							}
							else
							{
							   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",m,n,m,n);
							}
					}


			}



	}


}

