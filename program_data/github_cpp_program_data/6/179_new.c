/*
 * @Author
 * Student Name: Gulpinar Bolukbas
 * Student ID : 504141512
 * Date: 13.12.2014
 */

#include <iostream>
#include <string.h>

#define CHAIN_LENGTH 10
#define DNA_DATA_LENGTH 2
#define RNA_DATA_LENGTH 2
#define true 1;
#define false 0;


using namespace std;


/*Linked list  structure and function declerations*/
struct linkedlist
{
    char* pdata;
    linkedlist* next;
    
};

linkedlist*  initRna(char* rna );
void printRnas(linkedlist* pRNA1,linkedlist* pRNA2,linkedlist* pRNA3,linkedlist* pRNA4,linkedlist* pRNA5);
linkedlist* coupleDna(linkedlist* pRNA1,linkedlist* pRNA2,linkedlist* pRNA3,linkedlist* pRNA4,linkedlist* pRNA5);
void printChain(linkedlist* pChain);
linkedlist*  MergeRnas(linkedlist* pRNA1, linkedlist* pRNA2);
int IsDNA(char* pDNA);
int IsMatchRnas (linkedlist* pRNA1,linkedlist* pRNA2);

/****************************************************/



int main(int argc, const char * argv[])
{
    
  
  
    linkedlist* rna1 = initRna("ATGATGATGC");
    linkedlist* rna2 = initRna("TCGCGCTAGC");
    linkedlist* rna3 = initRna("CGTCGTAAAC");
    linkedlist* rna4 = initRna("TATTTACGAA");
    linkedlist* rna5 = initRna("TACTACTACG");
    printRnas(rna1, rna2, rna3, rna4, rna5);
    linkedlist* dna = coupleDna(rna1, rna2, rna3, rna4, rna5);
    printChain(dna);


    return 0;
}


linkedlist*  initRna(char* rna)
{
 
    linkedlist* head = NULL;
    linkedlist* traverse = NULL;
    

    for (int i =0; i< CHAIN_LENGTH; i++)
    {
        if (i == 0)
        {
            traverse = new linkedlist;
            head = traverse;
        }
        
        
        traverse->pdata= new char[RNA_DATA_LENGTH];
        *(traverse->pdata) = rna[i];
        if (i != CHAIN_LENGTH -1)
            traverse->next = new linkedlist;
        traverse = traverse->next;
        
    }
    traverse = NULL;
    return head;

}
void printRnas(linkedlist* pRNA1,linkedlist* pRNA2,linkedlist* pRNA3,linkedlist* pRNA4,linkedlist* pRNA5)
{
    
    int index =1;
 
    cout<<index++<<". ";
    printChain(pRNA1);
    cout<<index++<<". ";
    printChain(pRNA2);
    cout<<index++<<". ";
    printChain(pRNA3);
    cout<<index++<<". ";
    printChain(pRNA4);
    cout<<index++<<". ";
    printChain(pRNA5);




}



void printChain(linkedlist* pChain)
{
    linkedlist* traverse = pChain;
        
        while(traverse !=0)
        {
            cout<< traverse->pdata<< " " ;
            traverse = traverse->next;
        }
        cout<<endl;
    
}

linkedlist* coupleDna(linkedlist* pRNA1,linkedlist* pRNA2,linkedlist* pRNA3,linkedlist* pRNA4,linkedlist* pRNA5)
{
    linkedlist* arrayofLinkedList[5];
    arrayofLinkedList[0] =pRNA1;
    arrayofLinkedList[1] =pRNA2;
    arrayofLinkedList[2] =pRNA3;
    arrayofLinkedList[3] =pRNA4;
    arrayofLinkedList[4] =pRNA5;
    int indexfirst =0;
    int indexsecond =0;
    int Isfound = false;
    
    
    for (int i=0; i<5; i++)
    {
        for (int j=i+1; j<5;j++)
        {
           if( IsMatchRnas (arrayofLinkedList[i],arrayofLinkedList[j]))
           {
               Isfound = true;
               indexfirst =i;
               indexsecond = j;
               break;
           }
        
        }
        if (Isfound)
            break;
    }
    
    if (Isfound)
    {
        return MergeRnas(arrayofLinkedList[indexfirst], arrayofLinkedList[indexsecond]);
    }
    else
        return NULL;
        
    
}


linkedlist*  MergeRnas(linkedlist* pRNA1, linkedlist* pRNA2)
{
    
    linkedlist* head = NULL;
    linkedlist* traverse = NULL;
    
    
    for (int i =0; i< CHAIN_LENGTH; i++)
    {
        if (i == 0)
        {
            traverse = new linkedlist;
            head = traverse;
        }
        
        
        traverse->pdata= new char[DNA_DATA_LENGTH +1 ];
        (traverse->pdata)[0] = *(pRNA1->pdata);
        (traverse->pdata)[1] = *(pRNA2->pdata);
        if (i != CHAIN_LENGTH -1)
            traverse->next = new linkedlist;
        traverse = traverse->next;
        pRNA1 = pRNA1->next;
        pRNA2 = pRNA2->next;
        
    }
    traverse = NULL;
    return head;
    
}

int IsMatchRnas (linkedlist* pRNA1,linkedlist* pRNA2)
{
    
    char tmpDNA[DNA_DATA_LENGTH +1];
    for (int i =0; i< CHAIN_LENGTH; i++)
    {
   
        
        
        tmpDNA[0] = *(pRNA1->pdata);
        tmpDNA[1] = *(pRNA2->pdata);
        
        if(IsDNA(tmpDNA) == 0)
        {
            return false;
        }
        

        pRNA1 = pRNA1->next;
        pRNA2 = pRNA2->next;
        
    }
    

    return 1;
}
int IsDNA(char* pDNA)
{
    int isDNA = 0;
    
    if (strcmp("AT",pDNA) == 0)
        isDNA = 1;
    else if (strcmp("TA",pDNA) == 0)
        isDNA = 1;
    else if (strcmp("GC",pDNA) == 0)
        isDNA = 1;
    else if (strcmp("CG",pDNA) == 0)
        isDNA = 1;
    else
        isDNA = 0;
        
    return isDNA;

}

