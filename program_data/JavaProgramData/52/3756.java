package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * t;
	int[] a = new int[100];
	int temp;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0,p = a;i < n;i++,p++)
	{
	  *p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	p = a + n - m - 1; //???????
	for (i = n - m - 1;i >= 0;i--,p--)
	{
	  for (t = a + i + 1,j = i + 1;j < i + m + 1;j++,t++) //???????
	  {
		   temp = (t - 1);
		   *(t - 1) = *t;
		   *t = temp;
	  }
	}
	for (i = 0;i < n;i++) //???????
	{
	  System.out.print((a + i));
	  if (i != n - 1)
	  {
		System.out.print(' ');
	  }
	}
	return 0;
	}

}

