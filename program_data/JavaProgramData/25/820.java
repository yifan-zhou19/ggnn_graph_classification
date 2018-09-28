package <missing>;

public class GlobalMembers
{
	public static int[] longInt = new int[100];
	public static int Main()
	{
	 int size = 1; //??
	 int c; //??
	 int n; //n??
	 int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 longInt[0] = 1;
	 for (i = 0; i < n; i++)
	 {
	  c = 0;
	  for (int j = 0; j < size; j++)
	  {
	   longInt[j] = longInt[j] * 2 + c;
	   c = longInt[j] / 1000;
	   if (longInt[j] >= 1000)
	   {

		longInt[j] = longInt[j] % 1000;
		if (j == size-1)
		{
		 size++;
		}
	   }
	  }
	 }
	 for (i = size - 1; i > -1; i--)
	 {
	  if (i != size-1)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The cout 'setfill' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout<<setw(3)<<setfill('0');
	  }
	  System.out.printf("%3d", longInt[i]);

	 }
	 System.out.printf("%3d", "\n");

	 return 0;
	}
}

