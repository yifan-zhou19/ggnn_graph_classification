package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[100]);
	 cin.get(a,33);
	 int i = 0;
	 for (i = 0;i < 31;i = i + 1)
	 {
		 if (a.charAt(i) == '0' || a.charAt(i) == '1' || a.charAt(i) == '2' || a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5' || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8' || a.charAt(i) == '9')
		 {
			   if (a.charAt(i + 1) == '0' || a.charAt(i + 1) == '1' || a.charAt(i + 1) == '2' || a.charAt(i + 1) == '3' || a.charAt(i + 1) == '4' || a.charAt(i + 1) == '5' || a.charAt(i + 1) == '6' || a.charAt(i + 1) == '7' || a.charAt(i + 1) == '8' || a.charAt(i + 1) == '9')
			   {
				   System.out.print(a.charAt(i));
			   }
			   else
			   {
				   System.out.print(a.charAt(i));
				   System.out.print("\n");
			   }
		 }
	 }
	return 0;
	}

}
