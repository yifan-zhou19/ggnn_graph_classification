public class Student
	{
		public String ID = new String(new char[10]);
		public String name = new String(new char[20]);
		public char sex;
		public int age;
		public float[] score = new float[20];
		public String add = new String(new char[20]);
		public Student next;
	}

package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			Student[] a = tangible.Arrays.initializeWithDefaultStudentInstances(1000);
			Student head;
			Student p;
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i].ID = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				a[i].sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i].score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				a[i].add = tempVar6.charAt(0);
			}
			 if (a[i].ID.charAt(2) == 'd')
			 {
				 System.out.print("\n");
				 break;
			 }
		}
		for (j = i - 1;j >= 0;j--)
		{
			head = a[i - 1];
			a[j].next = a[j - 1];
			a[0].next = null;
			p = head;
		}
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",p.ID,p.name,p.sex,p.age,p.score,p.add);
			p = p.next;
		}while (p != null);
		return 0;
		}

}

