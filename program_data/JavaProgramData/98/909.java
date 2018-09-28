public class word
{
	public String str = new String(new char[50]);
	public int a;
	public word next;
}

package <missing>;

public class GlobalMembers
{
	public static word[] w = tangible.Arrays.initializeWithDefaultwordInstances(10000);
	public static int Main()
	{
		word head;
		word p1;
		word p2;
		word p;
		int n;
		int i = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (word)malloc(len);
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p1.str = tempVar2.charAt(0);
		 }
		p1.a = p1.str.length();
		head = null;
		while (i < n - 1)
		{
			i++;
			if (i == 1)
			{
			  head = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (word)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.str = tempVar3.charAt(0);
			}
			 p1.a = p1.str.length();
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		p = head;
		i = 0;
		while (i < n)
		{
		  System.out.printf("%s",p.str);
		  i++;
		  t = t + p.a;
		  p = p.next;
		 if (p != null)
		 {
		   while (t + 1 + p.a <= 80)
		   {
			 System.out.print(" ");
			 System.out.printf("%s",p.str);
			 i++;
			 t = t + 1 + p.a;
			 p = p.next;
			 if (p == null)
			 {
				 break;
			 }
		   }
		 }
		   System.out.print("\n");
		   t = 0;
		}
		return 0;
	}




}

