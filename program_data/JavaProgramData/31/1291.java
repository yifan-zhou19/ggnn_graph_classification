public class student
{
	   public String name = new String(new char[100]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   student head;
		   student p1;
		   student p2;
		   int i = 0;
		   int j = 0;
		   int m = 0;
		   int k = 0;
		   int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (student)malloc(Len);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p1.name = tempVar.charAt(0);
		   }
		   p1.next = null;
		   head = p1;
		   for (;strcmp(p1.name,"end") != 0;i++)
		   {
			   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   p1 = (student)malloc(Len);
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   p1.name = tempVar2.charAt(0);
			   }
			   p1.next = null;
			   p2.next = p1;
			   p2 = p1;
		   }
		 student p;
		 p = head;
		 j = 0;
		 n = i / 6;
		 for (m = 1;m <= n;m++)
		 {
			 p = head;
			 j = 0;

			 while (p != null && j != i - 6 * m)
			 {
				p = p.next;
				j++;
			 }

			 if (p != null && (j == i - 6 * m))
			 {
					for (k = 0;k < 5;k++)
					{
				   System.out.printf("%s ",p.name);
				   p = p.next;
					}
				   System.out.printf("%s",p.name);
			 }
			System.out.print("\n");
		 }
	}


}

