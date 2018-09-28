package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String N = new String(new char[101]);
	 int[] n = new int[100];
	 int[] dvd = new int[100];
	 int left = 0;
	 int len;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(dvd, 0, 100 * (Integer.SIZE / Byte.SIZE));
	 int i;
	 int temp;
	 N = new Scanner(System.in).nextLine();
	 len = N.length();
	 for (i = 0; i < len; i++)
	 {
	   n[i] = N.charAt(i) - '0';
	 }
	 for (i = 0; i < len; i++)
	 {
	  temp = left * 10 + n[i];
	  dvd[i] = temp / 13;
	  left = temp % 13;
	 }
	 for (i = 0; i < len; i++)
	 {
	  if (dvd[i] != 0)
	  {
		 break;
	  }
	 }
	 if (i == len)
	 {
		 System.out.print("0\n");
	 }
	 else
	 {
	  for (; i < len; i++)
	  {
	   System.out.printf("%d", dvd[i]);
	  }
	  System.out.print("\n");
	 }
	 System.out.printf("%d", left);

	}

}
