package <missing>;

public class GlobalMembers
{
	public static int Convert(int[] n, tangible.RefObject<String> s)
	{
	 int lenth;
	 int i;
	 int j;
	 lenth = s.argValue.length();
	 for (i = 0,j = 0;i < lenth;i++)
	 {
		 if (s.argValue.charAt(i) != ',')
		 {
			n[j] += n[j] * 10 + s.argValue.charAt(i) - '0';
		 }
		 else
		 {
			  j++;
		 }
	 }
	 return j + 1;
	}

	public static int Main()
	{
	 int[] x = new int[2000];
	 int[] y = new int[2000];
	 String s1 = new String(new char[4000]);
	 String s2 = new String(new char[4000]);
	 int t;
	 int i;
	 int num;
	 int count = 0;
	 int max = 0;

	 s1 = new Scanner(System.in).nextLine();
	 s2 = new Scanner(System.in).nextLine();

 tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
	 num = Convert(x, tempRef_s1);
	 s1 = tempRef_s1.argValue;
 tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
	 Convert(y, tempRef_s2);
	 s2 = tempRef_s2.argValue;
	 System.out.printf("%d",num);

	 for (t = 0;t < 1000;t++)
	 {
		  for (i = 0,count = 0;i < num;i++)
		  {
			   if (t >= x[i] != 0 && t < y[i])
			   {
				 count++;
			   }
		  }
		  if (count > max)
		  {
			 max = count;
		  }
	 }

	 System.out.printf(" %d",max);
	 return 1;
	}



}

