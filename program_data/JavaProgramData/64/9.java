package <missing>;

public class GlobalMembers
{
	public static int sq(int a,int b)
	{
		int r;
	  r = (a - b) * (a - b);
	  return (r);
	}

	public static float dis(int[] a, int[] b)
	{
		int i;
	  float s = 0F;
	  for (i = 0;i < 3;i++)
	  {
		s += sq(a[i], b[i]);
	  }
	  s = Math.sqrt(s);
	  return (s);

	}


	public static void Main()
	{
		int n;
		int i;
		int[][] a = new int[10][3];
		int t = 0;
		int k;
		int j;
		int p;
	  float[][] s = new float[50][3];
	  float r;

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
			  a[i][0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][1] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a[i][2] = Integer.parseInt(tempVar4);
		  }
	  }

	  for (i = 0;i < n - 1;i++)
	  {
		for (j = i + 1;j < n;j++)
		{
			s[t][0] = i;
		  s[t][1] = j;
		  s[t][2] = dis(a[i], a[j]);
		  t++;
		}
	  }

	  for (j = 1;j <= t - 1;j++)
	  {
		  for (i = 0;i < t - j;i++)
		  {
			  if (s[i][2] < s[i + 1][2])
			  {
				for (p = 0;p < 3;p++)
				{
					 r = s[i][p];
					 s[i][p] = s[i + 1][p];
					 s[i + 1][p] = r;
				}
			  }
		  }
	  }

	  for (i = 0;i < t;i++)
	  {
		  j = s[i][0];
		k = s[i][1];

		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[j][0],a[j][1],a[j][2],a[k][0],a[k][1],a[k][2],s[i][2]);
	  }




	}
}

