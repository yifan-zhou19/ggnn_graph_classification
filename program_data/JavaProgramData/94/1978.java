package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
	  int n; //length???????
	  int b;
	  int i;
	  int length = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0; i < n; i++)
	  {
		  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (b % 2 == 1) //???????????
		{
			a[length] = b;
		  length++;
		}
	  }
	  sort(a,a + length); //??
	  System.out.print(a[0]);
	  if (length > 1)
	  {
		  for (i = 1; i < length; i++)
		  {
		System.out.print(',');
		System.out.print(a[i]);
		  }
	  }
	  System.out.print("\n");
	  return 0;
	}
}

