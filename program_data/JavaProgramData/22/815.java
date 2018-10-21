package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   char c;
	   int value = 0;
	   int i = 0;
	   int max;
	   int next = -1;
	   int k;
	   int n;
	   int[] a = new int[300];
	   while ((c = System.in.read()) != '\n')
	   {
		if (c == ',')
		{
			 a[i] = value;
			 i = i + 1;
			 value = 0;
		}
		else
		{
			value = value * 10 + c - '0';
		}
	   }
	   a[i] = value;
	   i = i + 1;
	   max = a[0];
	   k = 1;
	   n = i;
	   while (k < n)
	   {
		 if (a[k] > max)
		 {
			  next = max;
			  max = a[k];
		 }
		 else
		 {
		 if ((a[k] < max) && (a[k]> next))
		 {
		 next = a[k];
		 }
		 }
		 k++;
	   }
		 if (next != -1)
		 {
		 System.out.printf("%d",next);
		 }
		 else
		 {
			 System.out.print("No");
		 }
	}
}
