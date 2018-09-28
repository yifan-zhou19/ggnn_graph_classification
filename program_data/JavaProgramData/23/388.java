package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] a = new char[100][101];
	 char c;
	 int i = 0;
	 do
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  i++;
	 }while (c != '\n');
	 for (i = i - 1;i > 0;i--)
	 {
	 System.out.print(a[i]);
	 System.out.print(" ");
	 }
	 System.out.print(a[0]);
	 System.out.print("\n");
	return 0;
	}

}

