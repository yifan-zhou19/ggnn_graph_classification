package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[300];
	  char ch;
	  int i;
	  int j;
	  j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a,0,(Integer.SIZE / Byte.SIZE));
	  while (scanf("%c", ch) != EOF)
	  {
		  a[ch]++;
	  }
	  for (i = 65;i <= 90;i++)
	  {
		if (a[i] != 0)
		{
		System.out.printf("%c=%d\n",i,a[i]);
		j++;
		}
	  }
	  for (i = 97;i <= 122;i++)
	  {
		if (a[i] != 0)
		{
		System.out.printf("%c=%d\n",i,a[i]);
		j++;
		}
	  }
	  if (j == 0)
	  {
		  System.out.print("No\n");
	  }
	}
}
