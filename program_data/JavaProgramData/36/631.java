package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 char t;
	 int i;
	 int j;
	 int flag = 0;
	 int n1 = 0;
	 int n2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	 n1 = a.length();
	 n2 = b.length();
	 for (i = 0;i < n1 - 1;i++)
	 {
	  for (j = 0;j < n1 - 1 - i;j++)
	  {
	   if (a[j] < a[j + 1])
	   {
		t = a[j];
		a[j] = a[j + 1];
		a[j + 1] = t;
	   }
	  }
	 }
	 for (i = 0;i < n2 - 1;i++)
	 {
	  for (j = 0;j < n2 - 1 - i;j++)
	  {
	   if (b[j] < b[j + 1])
	   {
		t = b[j];
		b[j] = b[j + 1];
		b[j + 1] = t;
	   }
	  }
	 }
	 if (n1 == n2)
	 {
	  flag = 1;
	 }
	 else
	 {
	  flag = 0;
	 }
	 if (flag = 1)
	 {
	  for (i = 0;i < n1;i++)
	  {
	   if (a[i] != b[i])
	   {
		flag = 0;
		break;
	   }
	   else
	   {
		flag = 1;
	   }
	  }
	 } //??
	 if (flag == 0)
	 {
	  System.out.print("NO");
	 }
	 else
	 {
	  System.out.print("YES");
	 }
	 System.out.print("\n");
	}

}

