//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	   public double x;
	   public double y;
	   public double z;
}

package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1001][1001];
	public static int[][] b = new int[1001][1001];
	public static int[][] c = new int[1001][1001];
	public static double[][] s = new double[1000001][3];
	public static AnonymousClass[] point = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(10001);
	public static double dis(int i,int j) //????
	{
		   return Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
	}
	public static void change(int n) //???
	{
		 double temp;
		 temp = s[n][0];
		 s[n][0] = s[n + 1][0];
		 s[n + 1][0] = temp;
		 temp = s[n][1];
		 s[n][1] = s[n + 1][1];
		 s[n + 1][1] = temp;
		 temp = s[n][2];
		 s[n][2] = s[n + 1][2];
		 s[n + 1][2] = temp;
	}
	public static void print(int n) //??
	{
		 int lt = (int)(s[n][1]);
		 int rt = (int)(s[n][2]);
		 System.out.print("(");
		 System.out.print(point[lt].x);
		 System.out.print(',');
		 System.out.print(point[lt].y);
		 System.out.print(',');
		 System.out.print(point[lt].z);
		 System.out.print(")");
		 System.out.print('-');
		 System.out.print("(");
		 System.out.print(point[rt].x);
		 System.out.print(',');
		 System.out.print(point[rt].y);
		 System.out.print(',');
		 System.out.print(point[rt].z);
		 System.out.print(")");
		 System.out.print('=');
		 System.out.printf("%.2f\n",s[n][0]);
	}
	public static void bubblesort(int k) //??
	{
		  int i;
		  int j;
		  for (i = 1;i < k;i++)
		  {
		for (j = 1;j <= k - i;j++)
		{
		if (s[j][0] < s[j + 1][0])
		{
		change(j);
		}
		}
		  }
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 1;i <= n;i++)
		{
		point[i].x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		point[i].y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		point[i].z = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		k = 1;
		for (i = 1;i <= n;i++)
		{
		for (j = i + 1;j <= n;j++)
		{
							s[k][0] = dis(i, j);
							s[k][1] = i;
							s[k][2] = j;
							k++;
		}
		}
		k--;
		bubblesort(k);
		for (i = 1;i <= k;i++)
		{
		print(i);
		}
		return 0;
	}
}

