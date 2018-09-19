package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[301],i,j,k,n,t;
	 int[] a = new int[301];
	 int i;
	 int j;
	 int k;
	 int n;
	 int t;
					  float av;
					  float[] cha = new float[301];
					  float temp;
					  float sum = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		for (i = 0;i < n;i++)
		{
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
				  sum = sum + a[i];
		}
		   av = sum / n;
		for (j = 0;j < n;j++)
		{
			cha[j] = Math.abs(a[j] - av);
		}
			 for (j = 0;j < n;j++)
			 {
				for (k = 0;k < n - j - 1;k++)
				{
				  if (cha[k + 1] > cha[k])
				  {
							temp = cha[k];
							t = a[k];
						cha[k] = cha[k + 1];
						a[k] = a[k + 1];
						cha[k + 1] = temp;
						a[k + 1] = t;
				  }
				}
			 }

		  if (cha[0] != cha[1])
		  {
			   System.out.printf("%d",a[0]);
		  }
		  else
		  {
				if (a[0] > a[1])
				{
			   System.out.printf("%d,%d",a[1],a[0]);
				}
			else
			{
				System.out.printf("%d,%d",a[0],a[1]);
			}
		  }
	}



}

