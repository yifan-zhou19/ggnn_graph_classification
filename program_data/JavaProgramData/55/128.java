package <missing>;

public class GlobalMembers
{
	public static char uup(char c)
	{
	  if (c >= 97)
	  {
		  c -= 32;
	  }
	  return (c);
	}
	public static void Main()
	{
	  char[] arr = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	  char[] brr = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	  int n;
	  int m;
	  int i;
	  int j;
	  int k;
	  int[] a = new int[40];
	  int[] b = new int[40];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  arr = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
	  i = arr.length();
	  for (k = 0;k < i;k++)
	  {
			if (uup(arr[k]) > 58)
			{
				a[i - k - 1] = uup(arr[k]) - 'A' + 10;
			}
			else
			{
				a[i - k - 1] = arr[k] - '0';
			}
	  }
	//if (n>30)printf("%d%d%d%d%d",a[0],a[1],a[2],a[3],a[4]);
	  for (k = 0;k < 40;k++)
	  {
		for (j = 39;j >= 1;j--)
		{
		  a[j - 1] = a[j - 1] + a[j] % m * n;
		  a[j] = a[j] / m;
		}
		b[k] = a[0] % m;
		a[0] = a[0] / m;
	  }
	  k = 39;
	  while ((b[k] == 0) && (k >= 1))
	  {
		  k--;
	  }
	  for (;k >= 0;k--)
	  {
		if (b[k] > 9)
		{
			System.out.printf("%c",b[k] + 'A' - 10);
		}
		else
		{
			System.out.printf("%d",b[k]);
		}
	  }
	  System.out.print("\n");
	}
}

