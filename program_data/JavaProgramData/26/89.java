package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		cin.get(a, 100, '\n');
		//cout << a ;
		int i = 0;
		int n = 0;
		n = a.length();
		for (i = 0 ; i <= n - 1 ; i++)
		{
			 if (a.charAt(i) != 32) //??a[i]???????
			 {
			 System.out.print(a.charAt(i));
			 }
			 else if (a.charAt(i + 1) != 32) //??a[i]??????????????
			 {
			 System.out.print(" ");
			 }
		}
	return 0;
	}
}
