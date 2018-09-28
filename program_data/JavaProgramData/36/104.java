package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int j;
	   String a = new String(new char[40]);
	   String b = new String(new char[40]);
	   String pa;
	   String pb;
	   char t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
	   pa = a.charAt(0);
	   pb = b.charAt(0);
	   for (i = 0;i < a.length();i++)
	   {
		   for (j = i;j < a.length();j++)
		   {
			   if (*(pa.Substring(i)) < *(pa.Substring(j)))
			   {
				 t = (pa.Substring(i));
				 *(pa.Substring(i)) = *(pa.Substring(j));
				 *(pa.Substring(j)) = t;
			   }
		   }
	   }
	   for (i = 0;i < b.length();i++)
	   {
		   for (j = i;j < b.length();j++)
		   {
			   if (*(pb.Substring(i)) < *(pb.Substring(j)))
			   {
				 t = (pb.Substring(i));
				 *(pb.Substring(i)) = *(pb.Substring(j));
				 *(pb.Substring(j)) = t;
			   }
		   }
	   }
	   if (strcmp(a,b) == 0)
	   {
		   System.out.print("YES");
	   }
	   else
	   {
		   System.out.print("NO");
	   }

	}
}

