package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] a = new char[100][100];
	 int[] b = new int[100];
	 int[] c = new int[100];
	 int i;
	 int j;
	 int max;
	 int min;
	 i = 0;
	 while (scanf("%s", a[i]) != EOF)
	 {
	   i++;
	 }
	 for (j = 0;j <= i - 1;j++)
	 {
	  b[j] = String.valueOf(a[j]).length();
	  c[j] = b[j];
	 }
	 max = 0;
	 min = 1000;
	 for (j = 0;j <= i - 1;j++)
	 {
	  if (c[j] > max)
	  {
	   max = c[j];
	  }
	  if (c[j] < min)
	  {
	   min = c[j];
	  }
	 }
	 for (j = 0;j <= i - 1;j++)
	 {
	  if (b[j] == max)
	  {
		System.out.println(a[j]);
		System.out.print("\n");
		break;
	  }
	 }
	 for (j = 0;j <= i - 1;j++)
	 {
	  if (b[j] == min)
	  {
		System.out.println(a[j]);
		break;
	  }
	 }

	}

}
