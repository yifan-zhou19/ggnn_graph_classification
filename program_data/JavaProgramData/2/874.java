public class student
{
	public String number = new String(new char[100]);
	public String name = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.number = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		head = null;
		do
		{
			i = i + 1;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.number = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
		} while (i < n - 1);
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int h;
		int i;
		int k;
		int m;
		int j;
		int max;
		student head;
		student p;
		int[] sum = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(); //????
		p = head;
		for (i = 65,k = 0;i <= 90;i++,k++) //???????????????
		{
			p = head;
		 do
		 {
				 m = p.name.length();
				 for (j = 0;j < m;j++)
				 {
					 if (p.name.charAt(j) == i)
					 {
						 sum[k]++;
					 }
				 }
				 p = p.next;
		 }while (p != null);
		}
		for (i = 0,max = sum[0];i <= k;i++)
		{
			if (sum[i] >= max)
			{
				h = i;
				max = sum[i];
			} //??????????????????????????????????????
		}
		 System.out.printf("%c\n%d\n",h + 65,max); //???????????max??????sum[i]?????
		 p = head;
		 do
		 {
				 m = p.name.length();
				 for (j = 0;j < m;j++)
				 {
					 if (p.name.charAt(j) == h + 65)
					 {
						 System.out.printf("%s\n",p.number);
					 }
				 }
				 p = p.next;
		 }while (p != null);
	}
	/*?????????????????????????????????????????????????????????????????
	???????????????????????????????????????????*/
}

