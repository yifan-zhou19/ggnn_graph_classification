public class shu
{
	public int haoma;
	public String b = new String(new char[26]);
	public shu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[26];
		int[][] c = new int[26][100];
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s,(*q)[100];
		int s;
		(int)(*q)[100];
		s = a;
		q = c;
		String m = new String(new char[26]);
		shu head;
		shu p;
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		 head = (shu)malloc(n * sizeof(shu));
		 p = head;
		 for (i = 0;i < n - 1;i++)
		 {
			 (p + i).next = p + i + 1;
		 }
		 (p + n - 1).next = null;
		 p = head;
		 for (;p != 0;)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p.haoma = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 p.b = tempVar3.charAt(0);
			 }
			m = p.b;
			 for (i = 0; * (m.Substring(i)) != '\0';i++)
			 {
				 *(*(q + *(m.Substring(i)) - 65) + *(s + *(m.Substring(i)) - 65)) = p.haoma;
				 //c[m[i]-65][a[m[i]-65]]=p->haoma;
				 *(s + *(m.Substring(i)) - 65) += 1;
				 //a[m[i]-65]++;			
			 }
			 p = p.next;
		 }
		 max = 0;
		 for (i = 0;i < 26;i++)
		 {
			 if (a[i] > max)
			 {
				 max = a[i];
				 n = i;
			 }
		 }
		 System.out.printf("%c\n",n + 65);
		 System.out.printf("%d\n",a[n]);
		 for (i = 0;i < a[n];i++)
		 {
			 System.out.printf("%d\n",*(*(q + n) + i));
		 }

	}
}

