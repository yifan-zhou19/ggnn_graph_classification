int sch = new int(int,int,char[],char[],int);
void main()
{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
//	struct student
//{
//	char name[20];
//int ave;
//int jud;
//char gan[2];
//char xib[2];
//int pap;
//struct student *next;
//}
//*p1,*p2,*head,*p;
int n;
int i;
int max;
int t;
String tempVar = ConsoleInput.scanfRead();
if (tempVar != null)
{
	n = Integer.parseInt(tempVar);
}

p = head = p1 = p2 = new student();
String tempVar2 = ConsoleInput.scanfRead();
if (tempVar2 != null)
{
	p1.name = tempVar2;
}
String tempVar3 = ConsoleInput.scanfRead();
if (tempVar3 != null)
{
	p1.ave = tempVar3;
}
String tempVar4 = ConsoleInput.scanfRead();
if (tempVar4 != null)
{
	p1.jud = tempVar4;
}
String tempVar5 = ConsoleInput.scanfRead();
if (tempVar5 != null)
{
	p1.gan = tempVar5;
}
String tempVar6 = ConsoleInput.scanfRead();
if (tempVar6 != null)
{
	p1.xib = tempVar6;
}
String tempVar7 = ConsoleInput.scanfRead();
if (tempVar7 != null)
{
	p1.pap = tempVar7;
}
max = t = sch(p1.ave,p1.jud,p1.gan,p1.xib,p1.pap);

for (i = 2;i <= n;i++)
{
	p1 = new student();

String tempVar8 = ConsoleInput.scanfRead();
if (tempVar8 != null)
{
	p1.name = tempVar8;
}
String tempVar9 = ConsoleInput.scanfRead();
if (tempVar9 != null)
{
	p1.ave = tempVar9;
}
String tempVar10 = ConsoleInput.scanfRead();
if (tempVar10 != null)
{
	p1.jud = tempVar10;
}
String tempVar11 = ConsoleInput.scanfRead();
if (tempVar11 != null)
{
	p1.gan = tempVar11;
}
String tempVar12 = ConsoleInput.scanfRead();
if (tempVar12 != null)
{
	p1.xib = tempVar12;
}
String tempVar13 = ConsoleInput.scanfRead();
if (tempVar13 != null)
{
	p1.pap = tempVar13;
}

t = t + sch(p1.ave,p1.jud,p1.gan,p1.xib,p1.pap);
if (sch(p1.ave,p1.jud,p1.gan,p1.xib,p1.pap) > max)
{
	max = sch(p1.ave,p1.jud,p1.gan,p1.xib,p1.pap);
p = p1;
}
p2.next = p1;
p2 = p1;
}
p2.next = null;
System.out.printf("%s\n%d\n%d\n",p.name,max,t);

}
int sch(int ave,int jud,char gan[],char xib[],int pap)
{
	int t = 0;
if (ave > 80 && pap >= 1)
{
t = t + 8000;
}
if (ave > 85 && jud > 80)
{
t = t + 4000;
}
if (ave > 90)
{
t = t + 2000;
}
if (ave > 85 && strcmp(xib,"Y") == 0)
{
t = t + 1000;
}
if (jud > 80 && strcmp(gan,"Y") == 0)
{
t = t + 850;
}
return (t);
}


