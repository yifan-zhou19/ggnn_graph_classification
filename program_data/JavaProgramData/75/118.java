package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] people = new int[1001];
	 int i = 0;
	 int length = 0;
	 do
	 {
	   x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 } while (System.in.read() == ',');
	 length = i;
	i = 0;
	 do
	 {
	   y[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 } while (System.in.read() == ',');
	 for (i = 0;i < length;i++)
	 {
	  for (int j = x[i];j < y[i];j++)
	  {
		 people[j]++;
	  }
	 }
	 int max = 0;
	 for (i = 0;i <= 1000;i++)
	 {
	  if (people[i] > max)
	  {
		max = people[i];
	  }
	 }
	 System.out.print(length);
	 System.out.print(' ');
	 System.out.print(max);
	 return 0;
	}

}

