package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String zf = new String(new char[310 * 100]);
	  int[] sz = new int[310];
	  zf = new Scanner(System.in).nextLine();
	  int n;
	  int i;
	  int e;
	  int m;
	  int j;
	  n = 0;
	  e = 0;
	  for (i = 0;zf.charAt(i) != 0;i++)
	  {
		if (zf.charAt(i) != ' ')
		{
		  for (j = i + 1;zf.charAt(j) != 0 && zf.charAt(j) != ' ';j++)
		  {
			  ;
		  }
		sz[n] = j - i;
		n++;
		if (zf.charAt(j) == 0)
		{
		 break;
		}
			else
			{
			i = j;
			}
		}
	  }
	  System.out.printf("%d",sz[0]);
	  for (i = 1;i < n;i++)
	  {
		 System.out.printf(",%d",sz[i]);
	  }
	 return 0;
	}
}
