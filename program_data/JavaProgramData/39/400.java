public class stu
{
	public String num = new String(new char[200]);
public int qimo;
public int banji;
public char gan;
public char sheng;
public int lun;
public int qian;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(stu head, stu q)
	{
		stu pre = head;
		stu p = pre.next;
		stu s;
		s = new stu();
		s.banji = q.banji;
		s.num = q.num;
		s.qimo = q.qimo;
		s.qian = q.qian;
		s.sheng = q.sheng;
		s.gan = q.gan;
		s.next = null;
		while ((p != null) && (s.qian <= p.qian))
		{
			pre = p;
			p = p.next;
		}
		pre.next = s;
		s.next = p;
	}
	public static void Main()
	{
		int n;
		int k;
		int i;
		int all;
		int tol = 0;
		float m;
		String num = new String(new char[20]);
		stu head;
		stu p;
		stu q;
		head = new stu();
		head.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			all = 0;
			 p = new stu();
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p.num = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 p.qimo = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 p.banji = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 p.gan = tempVar5.charAt(0);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 p.sheng = tempVar6.charAt(0);
			 }
			 String tempVar7 = ConsoleInput.scanfRead(" ");
			 if (tempVar7 != null)
			 {
				 p.lun = Integer.parseInt(tempVar7);
			 }
			 if ((p.qimo > 80) && (p.lun > 0))
			 {
				 all = all + 8000;
			 }
			 if ((p.qimo > 85) && (p.banji > 80))
			 {
				 all = all + 4000;
			 }
			 if (p.qimo > 90)
			 {
				 all = all + 2000;
			 }
			 if ((p.qimo > 85) && (p.sheng == 'Y'))
			 {
				 all = all + 1000;
			 }
			 if ((p.banji > 80) && (p.gan == 'Y'))
			 {
				 all = all + 850;
			 }
			 p.qian = all;
			 tol = tol + all;
			 sort(head, p);
		}
		p = head.next;
		System.out.printf("%s\n",p.num);
		System.out.printf("%d\n",p.qian);
		System.out.printf("%d\n",tol);
	}
}

